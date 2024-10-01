public class MemorablePassword : IPassword{

    private List<string> wordList = new List<string>();
    public MemorablePassword(){
        LoadWords();
    }

    private void LoadWords(){
        try{
            wordList = new List<string>();
            string[] words = System.IO.File.ReadAllLines("palabras.txt");

            if(words.Length == 0){
                throw new Exception("El archivo de palabras esta vacio");
            }

            wordList.AddRange(words);
        }catch(Exception e){
            Console.WriteLine($"Error al cargar las palabras: {e.Message}");
            throw;
        }
    }

    public string GeneratePassword(){
        Random random = new Random();
        string password = wordList[random.Next(wordList.Count)] +
                        wordList[random.Next(wordList.Count)] + 
                        wordList[random.Next(wordList.Count)] ;

        string specialChars = "!@#$%&*";
        password += random.Next(100,999).ToString();
        password += specialChars[random.Next(specialChars.Length)];

        return password;
    }
}