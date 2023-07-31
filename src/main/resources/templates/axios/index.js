console.log('inside index.js');

const { response } = require('express')
const express = require('express')
const { request } = require('http')

const app = express()


// define middleware for all request
app.use((request, response, next) => {
	console.log('init express app')
	console.log(request)
	next()})

// define route path for GET request on "/"" end point
app.get('/',(request,response) => {
	response.send('this is response for request /');
})

app.listen(3000,() => console.log('now app is listening on port 3000'));