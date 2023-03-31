var MongoClient= require('mongodb').MongoClient
MongoClient.connect('mongodb://127.0.0.1:27017',ketnoi)
function ketnoi(err, conn) {
    if(err) return console.log('cant connected')
    console.log('connected')
    conn.close()
}