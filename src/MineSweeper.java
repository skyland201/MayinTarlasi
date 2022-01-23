import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MineSweeper {
    int rowNumber;
    int colNumber;
    MineSweeper(int rowNumber,int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;
    }
    void run(){
        String[][] str=new String[this.colNumber][this.rowNumber];
        String[][] str2=new String[this.colNumber][this.rowNumber];
        int bomba=(this.colNumber*this.rowNumber)/4;
        int hak=(this.colNumber*this.rowNumber)-bomba;


        for (int i = 0; i <bomba ; i++) {
            int l= (int) (Math.random()*(this.rowNumber));
            int k=(int) (Math.random()*(this.colNumber));
           str2[l][k]="*";
        }


        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <str[0].length ; j++) {
                if(str2[i][j]=="*"){

                }else{
                    str2[i][j]="- ";
                }
                if(j==(str[0].length-1))
                    System.out.println();
            }
        }
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <str[0].length ; j++) {
                str[i][j]="- ";
                System.out.print(str[i][j]);
                if(j==(str[0].length-1))
                    System.out.println();
            }
        }
        while (true){
            Scanner input=new Scanner(System.in);
            System.out.println("Satır giriniz : ");
            int satır= input.nextInt();
            System.out.println("Sütun giriniz : ");
            int sütun= input.nextInt();
            int bombaSayısı=0;
            if((satır<0||satır>(this.rowNumber-1))||(sütun<0||sütun>(this.colNumber-1))){
                System.out.println("Hatalı sayı girdiniz! Tekrar Deneyin.");
            }else{
                hak--;

                System.out.println("===================");
                if(str2[satır][sütun]=="*") {
                    System.out.println("Game Over...");
                    System.out.println("===================");
                    break;
                }



                if(satır==0&&sütun==0){
                    for (int i = 0; i <2 ; i++) {
                        for (int j = 0; j <2 ; j++) {
                            if(str2[i][j]=="*")
                                bombaSayısı++;

                        }
                    }str[satır][sütun]=String.valueOf(bombaSayısı);

                }
                else if(satır==0&&sütun!=0){
                    if(sütun==(this.colNumber-1)){
                        for (int i = 0; i <2 ; i++) {
                            for (int j = (sütun-1); j <sütun+1 ; j++) {
                                if(str2[i][j]=="*")
                                    bombaSayısı++;

                            }
                        }

                    }else{
                        for (int i = 0; i <2 ; i++) {
                            for (int j = (sütun-1); j <(sütun+2) ; j++) {
                                if(str2[i][j]=="*")
                                    bombaSayısı++;
                            }
                        }
                    }
                    str[satır][sütun]=String.valueOf(bombaSayısı);
                }else if(sütun==0&&satır!=0) {
                    if(satır==(this.rowNumber-1)){
                        for (int i = (satır-1); i <(satır+1) ; i++) {
                            for (int j = 0; j <2 ; j++) {
                                if(str2[i][j]=="*")
                                    bombaSayısı++;

                            }
                        }

                    }else {
                        for (int i = (satır-1); i <(satır+2) ; i++) {
                            for (int j = 0; j <(sütun+2) ; j++) {
                                if(str2[i][j]=="*")
                                    bombaSayısı++;

                            }
                        }
                    }
                    str[satır][sütun]=String.valueOf(bombaSayısı);

                }else if(satır==(this.rowNumber-1)&&sütun!=(this.colNumber-1)){
                    for (int i = (satır-1); i <(satır+1) ; i++) {
                        for (int j = (sütun-1); j <(sütun+2) ; j++) {
                            if(str2[i][j]=="*")
                                bombaSayısı++;

                        }
                    }str[satır][sütun]=String.valueOf(bombaSayısı);


                }else if(satır==(this.rowNumber-1)&&sütun==(this.colNumber-1)){
                    for (int i = (satır-1); i <(satır+1) ; i++) {
                        for (int j = (sütun-1); j <(sütun+1) ; j++) {
                            if(str2[i][j]=="*")
                                bombaSayısı++;

                        }
                    }str[satır][sütun]=String.valueOf(bombaSayısı);
                }else{
                    if(sütun==(colNumber-1)){
                        for (int i = (satır-1); i <(satır+2) ; i++) {
                            for (int j = (sütun-1); j <(sütun+1) ; j++) {
                                if(str2[i][j]=="*")
                                    bombaSayısı++;

                            }
                        }
                    }else{
                        for (int i = (satır-1); i <(satır+2) ; i++) {
                            for (int j = (sütun-1); j <(sütun+2) ; j++) {
                                if(str2[i][j]=="*")
                                    bombaSayısı++;

                            }
                        }
                    }
                    str[satır][sütun]=String.valueOf(bombaSayısı);
                }





                if(hak==0){
                    System.out.println("Oyunu Kazandınız.");
                    for (int i = 0; i <str.length ; i++) {
                        for (int j = 0; j <str[0].length; j++) {
                            System.out.print(str[i][j]+" ");
                            if(j==(str[0].length-1))
                                System.out.println();

                        }
                    }System.out.println("===================");break;

                }
                for (int i = 0; i <str.length ; i++) {
                    for (int j = 0; j <str[0].length; j++) {
                        System.out.print(str[i][j]+" ");
                        if(j==(str[0].length-1))
                            System.out.println();
                    }
                }
            }
            }
        }
    }

