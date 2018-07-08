# ExamineFile
An application which can examine file as the specified encryption.

## How to use this 
### If you want to check file
* 1.If you execute program in cli  
    java Bootstrap filePath targetEncodedString encodeType  
    e.g. if you input  
    java Bootstrap C:\Users\liuyi\Downloads\HaskellPlatform-8.4.3-full-x86_64-setup.exe 7a994fa88c8807956f7e78ec6dff227f333e1158ca251c1df7bcce55817ee4ae SHA-256  
    If program test successfully,it will output true.
* 2.If you execute program id IDE  
    You can add configuration(program arguments)  
    argument order is filePath targetEncodedString encodeType   
    e.g. If you add arguments as   
    C:\Users\liuyi\Downloads\HaskellPlatform-8.4.3-full-x86_64-setup.exe 7a994fa88c8807956f7e78ec6dff227f333e1158ca251c1df7bcce55817ee4ae SHA-256  
    If program test successfully,it will output true.
### If you want to generate encodedString
* 1.If you execute program in cli  
    java Bootstrap filePath generate encodeType  
    e.g. if you input  
    java Bootstrap C:\Users\liuyi\Downloads\HaskellPlatform-8.4.3-full-x86_64-setup.exe generate SHA-256  
    If program test successfully,it will output encodedString.
* 2.If you execute program id IDE  
    You can add configuration(program arguments)  
    argument order is filePath generate encodeType   
    e.g. If you add arguments as   
    C:\Users\liuyi\Downloads\HaskellPlatform-8.4.3-full-x86_64-setup.exe generate SHA-256  
    If program test successfully,it will output encodedString.       
         