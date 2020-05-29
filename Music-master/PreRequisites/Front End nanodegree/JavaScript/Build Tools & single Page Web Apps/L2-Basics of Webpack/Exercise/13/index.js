var path = require('path')
const express = require('express')
const mockAPIResponse = require('./mockAPI.js')

const app = express()

// TODO 2: Update to use `dist` here
app.use(express.static('src/client'))

console.log(__dirname)

app.get('/', function (req, res) {
    // TODO 1: Update this to use the dist index.html file
    res.sendFile('/client/views/index.html')
})

// designates what port the app will listen to for incoming requests
app.listen(3000, function () {
    console.log('Example app listening on port 3000!')
})

app.get('/test', function (req, res) {
    res.send(mockAPIResponse)
})
