//const axios = require('axios');

var app = new Vue(
    {
        el : '#app',
        data : {
            info : []
                          
    },
    mounted () {
        fetch('http://localhost:8080/todos')
        .then(response => response.json())
        .then((data) => {
            this.info = data;
        })

            
    }
})