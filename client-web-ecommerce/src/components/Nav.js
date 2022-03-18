import React from "react";
import { NavLink } from "react-router-dom";
import Constaints from "../utils/Constaints";


const Nav = () => {
  const isFornecedor = localStorage.getItem(Constaints.FORNECEDOR)

  return (
    <div>
      <div className="top-0 w-full flex flex-wrap">
        <section className="x-auto">
          <nav className="flex justify-between bg-gray-200 text-blue-800 w-screen">
            <div className="px-5 xl:px-12 py-6 flex w-full items-center">
              <h1 className="text-3xl font-bold font-heading">
                {process.env.REACT_APP_TITLE}
              </h1>
             
                    <ul className="hidden md:flex px-4 mx-auto font-semibold font-heading space-x-12">
                    
                    <li>
                      <NavLink exact={true} className="navbar-brand" activeClassName='active' to='/'>Products</NavLink>
                    </li>
                    <li  hidden={isFornecedor==="false"}>
                      <NavLink exact={true} className="navbar-brand" activeClassName='active' to='/product/create'>New Product</NavLink>
                    </li>
                    
                  </ul>
            </div>
          </nav>
        </section>
      </div>
    </div>
  );
  };

export default Nav;