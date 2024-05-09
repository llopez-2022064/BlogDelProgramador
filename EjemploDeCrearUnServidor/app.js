//ESModules - actual
import express from 'express'

const app = express() //Creando el servidor
const port = 3200

/**
 * Metodos HTTP
 * get -> obtener
 * post
 * put
 * delete
 */


//Enrutamiento 
app.get('/', (req, res)=>{
    res.send('Hello World')
})

app.get('/getId/:id', (req, res) =>{ //:id significa que es un parametro que se envia por ruta
    let {id} = req.params //Desestructuracion
    res.send(`product with id ${id}`)
}) //http://localhost:3200/getId/777


app.get('/user/:id/:phone?', (req, res) => { //Si se coloca el signo de ? esopcional
    let phone =req.params.phone ?? 'Sin configurar';
    res.send(`User Id is ${req.params.id}, with phone ${phone}`)
}) //http://localhost:3200/user/4/44614876

//Levantar el servidor
app.listen(port, ()=> console.log(`Server is running in port ${port}`)) //String templates - Sting Literal

