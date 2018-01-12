class FileReader:

   
    
    def __init__(self,fileName):
        self.fileName=fileName;
        print("FileName: "+ fileName);

    def openFile(self):
        file = open(self.fileName,"w")
        print("File Opened!!");
        return file;

    def writeIntoFile(self,file):
        file.write("Writing...\n")
        file.write("Hello Python...\n") 
        file.write("and this is another line...\n") 
        file.write("Why? Because we can...")
        print("Containt written in given file!! " + self.fileName);
 
    def closeFile(self,file):
         file.close()
         print("File Closed!!");

fileReader=FileReader("E:\Java.java");
file=fileReader.openFile();
fileReader.writeIntoFile(file);
fileReader.closeFile(file);

