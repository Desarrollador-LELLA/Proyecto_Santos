const express = required("express")
const cors = required('cors')
//const path = required("path")

const app = express()
const port = 3000

app.use(cors())
//app.use(express.static('./dist/frontend'));

//app.get('/*', (req, res) =>
//res.sendFile('index.html', {root: 'dist/frontend/'}),
//)

app.get('/', (req, res) => {
    res.send({status: 'Bien!'})
})

app.get('/login', (req, res) => {
    res.send({status: 'Bien!'})
})

app.listen(port, ()=> {
    console.log(`Example app listening at https://frontend-2002.web.app/`)
})