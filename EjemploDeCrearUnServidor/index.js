//Impportaciones / Exportaciones de Modulos

/*
    1. CommonJS -> +proyectos / Nacio con NodeJs
    2. ESModules -> -proyectos / +rapido (hay que verificar la compatibilidad con las librerias)
*/



//Ejemplo de crear un servidor
//CommonJS
                //request, response
const http = require('http')

http.createServer(function (req, res){
    res.writeHead(200, {'Content-Type' : 'text/html'}) //metadata
    res.end('Hola Mundo IN6AV')
}).listen(3000)

console.log('El servidor esta corriendo')