package com.iesebre.mp3.uf2.library;

public class Data {

    /**
     * Comprova si una data és correcta
     * @param dia dia del mes
     * @param mes mes de l'any
     * @param any any
     * @return true si la data és correcta, false en cas contrari
     */
    public static boolean dataCorrecta(int dia, int mes, int any) {
        //Comprovem que el dia siga correcte
        if (dia < 1 || dia > 31) return false;

        //Comprovem que el mes siga correcte
        if (mes < 1 || mes > 12) return false;

        //Comprovem que el dia siga correcte segons el mes
        if (mes == 2) {
            if (dia > 29) return false;
            if (dia == 29) {
                return esBixest(any);
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) return false;
        }
        return true;
    }

    /**
     * Comprova si un any és bixest
     * @param any any a comprovar
     * @return true si l'any és bixest, false en cas contrari
     */
    public static boolean esBixest(int any) {
        if (any % 4 != 0) return false;
        if (any % 100 == 0 && any % 400 != 0) return false;
        return true;
    }

    /**
     * Obtenim la data de demà
     * @param dia dia del mes
     * @param mes mes de l'any
     * @param any any
     * @return un vector de 3 caselles amb el dia, mes i any del dia següent, o null si la data rebuda rebuda era incorrecta
     */
    public static int[] diaSeguent(int dia, int mes, int any){

        //Comprovem si la data rebuda és correcta, i si no ho és retornem null
        if(!dataCorrecta(dia, mes, any)) return null;

        //Incrementem el dia
        if(dataCorrecta(dia+1, mes, any)) return new int[]{dia+1, mes, any};

        //Incrementem el mes i passem al dia 1
        if(dataCorrecta(1, mes+1, any)) return new int[]{1, mes+1, any};

        //Passem a l'1 de gener de l'any següent
        return new int[]{1, 1, any+1};

    }

    /**
     * Compara dues dates
     * @param dia1 dia del mes de la primera data
     * @param mes1 mes de l'any de la primera data
     * @param any1 any de la primera data
     * @param dia2 dia del mes de la segona data
     * @param mes2 mes de l'any de la segona data
     * @param any2 any de la segona data
     * @return -2 si alguna de les dates és incorrecta, -1 si la primera data és més antiga que la segona, 0 si són
     * iguals, 1 si la primera data és més recent que la segona
     */
    public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2){
        //Comprovem si les dates són correctes
        if(!dataCorrecta(dia1, mes1, any1) || !dataCorrecta(dia2, mes2, any2)) return -2;

        //Comprovem si les dates són iguals
        if(dia1==dia2 && mes1==mes2 && any1==any2) return 0;

        //Comprovem si la primera data és més antiga que la segona
        if(any1<any2) return -1;
        if(any1==any2 && mes1<mes2) return -1;
        if(any1==any2 && mes1==mes2 && dia1<dia2) return -1;

        //Si no és cap dels casos anteriors, la primera data és més recent que la segona
        return 1;

        //Una altra possiblew forma de resoldre-ho
//        if(any1<any2) return -1;
//        else if(any1>any2) return 1;
//        else{       //any1==any2
//            if(mes1<mes2) return -1;
//            else if(mes1>mes2) return 1;
//            else{   //mes1==mes2
//                if(dia1<dia2) return -1;
//                else if(dia1>dia2) return 1;
//                else return 0;
//            }
//        }
    }

    public static int diferenciaDies(int dia1, int mes1, int any1, int dia2, int mes2, int any2){

       //Mirem si la primera data és menor que la segona, i sinó intercanviem els seus valors
       switch(comparaDates(dia1, mes1, any1, dia2, mes2, any2)){
           case -2: //hi ha alguna data incorrecta
                return -1;

                case -1: //la primera data és més antiga que la segona
                    break;
           case 0:   //les dates són iguals
               return 0;
           case 1:   //la primera data és més recent que la segona
               //Intercanviem els valors de les variables
               int aux;
               aux=dia1; dia1=dia2; dia2=aux;
               aux=mes1; mes1=mes2; mes2=aux;
               aux=any1; any1=any2; any2=aux;
       }

       //Aquí sabem que la primera data és més antiga que la segona
       int dies=0;          //comptador de dies que hi ha entre les dates

       //Bucle que incrementa data1 fins que sigue igual a data2
       while(comparaDates(dia1,mes1,any1,dia2,mes2,any2)!=0){
           //Passem la primera data al dia següent
           int[] dema = diaSeguent(dia1,mes1,any1);
           dia1=dema[0];
           mes1=dema[1];
           any1=dema[2];

           //Incrementem el comptador de dies
           dies++;
       }

       //El resultat el tenim al comptador de dies
        return dies;
    }





}
