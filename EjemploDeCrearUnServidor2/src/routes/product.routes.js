const express = require('express')
const productController = require('../controllers/product.controller')

//Enrutador de express
const api = express.Router()

//Defino las rutas        //Ejecutar
api.post('/newProduct', productController.newProduct)

module.exports = api;