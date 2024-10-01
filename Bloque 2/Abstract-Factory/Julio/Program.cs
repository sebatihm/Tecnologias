class Program{
    static void Main(string[] args){
        PasswordFactory specialFactory = new SpecialCharacterPasswordFactory();
        IPassword specialPassword = specialFactory.CreatePassword();
        IPassword contraseñaparamifacebook = specialFactory.CreatePassword();
        Console.WriteLine($"Contraseña con caracteres especiales {specialPassword.GeneratePassword()}");
        Console.WriteLine($"Contraseña para mi Facebook: {contraseñaparamifacebook.GeneratePassword()}");

        PasswordFactory memorableFactory = new MemorablePasswordFactory();
        IPassword memorablePassword = memorableFactory.CreatePassword();
        IPassword memorablePassword2 = memorableFactory.CreatePassword();
        Console.WriteLine($"Contraseña con mis palabras: {memorablePassword.GeneratePassword()}");
        Console.WriteLine($"Otra contraseña de ejemplo: {memorablePassword2.GeneratePassword()}");


    }
}