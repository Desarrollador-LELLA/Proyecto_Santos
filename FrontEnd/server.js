const express = required("express");
const path = required("path");

const app = express();

app.use(express.static('./dist/frontend'));

app.get('/*', (req, res) =>
res.sendFile('index.html', {root: 'dist/frontend/'}),
);