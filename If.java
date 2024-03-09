package com.mycompany.If;


public class If implements Execute{
    private static boolean statusElse = true;
    
    public If(){}
    
//    String
    public static  void IfValuesString(String v1, String typeIf, String v2, Execute exe){
        If.statusElse = true;
        
        switch(typeIf)
        {
            case "==":   if(v1 == v2){exe.Excutes(); }  else{If.statusElse = false;}   break;
            case "!=" :  if(v1 != v2){exe.Excutes();} else{If.statusElse = false;}  break;
            default:
                System.out.println("Error IfValues");
        }
    }
       
   //Condição Simples
    public static  void IfValuesInt(int v1, String typeIf, int v2, Execute exe){
        If.statusElse = true;
        
        switch(typeIf)
        {
            case "==":   if(v1 == v2){exe.Excutes();}    break;
            case "!=" :  if(v1 != v2){exe.Excutes();}   break;
            case ">":   if(v1 > v2){exe.Excutes();} break;
            case "<":   if(v1 < v2){exe.Excutes();} break;
            case ">=":   if(v1 >= v2){exe.Excutes();} break;
            case "<=":   if(v1 <= v2){exe.Excutes();} break;
            default:
                System.out.println("Error IfValues");
        }
    }
    
    //Condição Simples
    public static  void IfValuesDouble(double v1, String typeIf, double v2, Execute exe){
        If.statusElse = true;
        
        switch(typeIf)
        {
            case "==":   if(v1 == v2){exe.Excutes();} else{If.statusElse = false;}   break;
            case "!=" :  if(v1 != v2){exe.Excutes();} else{If.statusElse = false;}  break;
            case ">":   if(v1 > v2){exe.Excutes();}  else{If.statusElse = false;} break;
            case "<":   if(v1 < v2){exe.Excutes();}  else{If.statusElse = false;} break;
            case ">=":   if(v1 >= v2){exe.Excutes();} else{If.statusElse = false;} break;
            case "<=":   if(v1 <= v2){exe.Excutes();} else{If.statusElse = false;}  break;
            default:
                System.out.println("Error IfValues");
        }
    }
    
    //Condição Simples
     public static  void IfValuesN(boolean resultCondition, Execute exe){
        If.statusElse = true;
        if(resultCondition == true){exe.Excutes();}else{If.statusElse = false;}         
    }
         
     public static void IfElseN(Execute exe){
         if(If.statusElse == false){exe.Excutes();};
     }
     
    public void Excutes() { }
    
    public String ToString(){
        return "IfValuesString -> Comparar com String" + "\n"
                + "IfValuesDouble -> Comparar com Double" + "\n"
                + "IfValuesInt -> Comparar com Int\n"
                + "IfValuesN -> Comparar muitos valores";   
    }
}
