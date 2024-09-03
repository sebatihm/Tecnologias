public class Sesion{
    private string _usuario;
    private string _password;

    public Sesion(string usuario, string password){
        this._usuario = usuario;
        this._password = password;
    }

    public bool IniciarSesion(){
        return _usuario == "pepe" && _password == "1234";
    }
}