import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Nav from "./components/Nav";
import CreateProduct from "./pages/product/CreateProduct";
import ProductList from "./pages/product/ProductList";

function App() {
 return (
   <div>
     
      <BrowserRouter>
        <Nav />
          <Routes>  
            <Route exact path="/" element={<ProductList />} />
            <Route exact path="/product/create" element={<CreateProduct />} />
            
          </Routes>
      </BrowserRouter>
     
   </div>
 );
}

export default App;