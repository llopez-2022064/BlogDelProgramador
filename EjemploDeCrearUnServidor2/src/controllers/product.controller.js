'use strict'

const Product = require('../models/product.model')//<- Creando un nuevo Objeto //El unico que tiene derecho a ser mayuscula

//Funciones Handler

exports.newProduct = async (req, res)=> { //post, porque el usuario va a enviar la info
    try {
        let data = req.body;
        let product = new Product()        
        await product.save() // await espera que se termine de ejecutar esta linea
        res.send({message: 'Product saved successfully'})
    } catch (error) {
        console.error(error)
        res.status(500).send({message: 'Error creating product'})
    }
}