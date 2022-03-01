class Users extends Account {
    constructor(nombre, document, email, password){
        super(nombre, document, email, password)
    }
    printDataUser(){
        console.log("nombre del usuario: ",this.nombre);
        console.log("Documento:",this.document);
        console.log("email:",this.email);
        console.log("Contraseña",this.password);
    }
}