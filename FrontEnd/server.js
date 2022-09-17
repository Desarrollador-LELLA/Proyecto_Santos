const express = required("express")
const cors = required('cors')
//const path = required("path")

const app = express()
const port = 3000

app.use(cors())
app.use(express.static('./dist/frontend'));

app.get('/*', (req, res) =>
res.sendFile('index.html', {root: 'dist/frontend/'}),
)

app.get('/', (req, res) => {
    res.send({status: 'Bien!'})
})

app.get('/login', (req, res) => {
    res.send({status: 'Bien!'})
})

app.listen(port, ()=> {
    console.log(`Example app listening at https://frontend-2002.web.app/`)
})

//Enable CORS for all HTTP methods
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE, OPTIONS");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
  });