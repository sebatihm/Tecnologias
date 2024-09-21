using System.Diagnostics;
using Spire.Doc;

class Program{
    public static void main(String[] args){
        // Fabricas
        IFileFactory converterFactory;
        //Convertidor base
        IFileConverter fileConverter;

        string fileName;
        Console.WriteLine("Que tipo de archivo desea convertir \n1.- PDF A JPG\n2.-DOCX a jpg");
        int opcion;
        opcion = Convert.ToInt32(Console.ReadLine());

        switch (opcion){
            case 1:
                converterFactory = new PDFFactory();
                fileName = GetFileName(); 
            break;

            case 2:
                converterFactory = new PDFFactory();
                fileName = GetFileName();
            break;

            default:
                return;
        }

        fileConverter = converterFactory.InitializeConverter();
        fileConverter.Conversion(fileName);

    }

    public static string GetFileName(){
        Console.WriteLine("Introduce el nombre del archivo");
        return Console.ReadLine() ?? string.Empty;
    } 
}
