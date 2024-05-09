'use strict'

//Levantar el servidor HTTP
//Conectar a la DB

//CommoJS
const mongoose = require('mongoose')
const express = require('express')
const productRoutes = require('./src/routes/product.routes')

//Ejemplo de conexion con promise / Callback
//Expresion
/* const connect = () =>{
    const uriMongo = 'mongodb://127.0.0.1:27017/EjemploIN6AV2024' //Puerto por defecto de MongoDB 27017
    mongoose.Promise = global.Promise

    // mongoose.connect.once('connecting', ()=>{ //DBA data basea administrion
    //     console.log('MongoDB | Try connecting')
    // })

    // mongoose.connection.once('open', ()=>{
    //     console.log('MongoDB | conectado a la DB')
    // })

    mongoose.connect(uriMongo,{
        connectTimeoutMS: 8000,
        maxPoolSize: 50
    })
    .then(()=> console.log('Connected to DB'))
    .catch(err => console.error(err))
}
*/


//Ejemplo de conexion con Async/Await
const connect = async ()=>{
    try {
        const uriMongo = 'mongodb://127.0.0.1:27017/EjemploIN6AV2024'
        await mongoose.connect(uriMongo) //si falla -> catch
        return console.log('Connected to DB')
    } catch (error) {
        console.error(error)
    }
}


// --------------------------- Servidor de express ----------------------------
//Configurar el servidor
const app = express()
const port = 3200
app.use(express.urlencoded({extended: false})) //Configurar la codificacion
app.use(express.json()) //Siempre en formato JSON
app.use(productRoutes)

//Levantar el servidor
const initServer = ()=> app.listen(port, ()=> console.log(`Listening on port ${port}`))

initServer()
connect()