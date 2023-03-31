//cách 2 viết theo module
var load_router = function(req, res) {
    console.log(req.url);
};
module.exports.load_router = load_router;