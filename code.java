import java.util.Scanner;
public class code{
    public static void main(String[]args){
        boolean exit =false;
        int consaltionsf=-999999999;
        int costf=-999999999;//income and cost for france i used this imaginary number for a reason i will mention it later
        int incomef=-999999999;
        int consaltionsb=-999999999;
        int costb=-999999999;//income and cost for belgium
        int incomeb=-999999999;
        int consaltionsg=-999999999;
        int costg=-999999999;//income and cost for germany
        int incomeg=-999999999;
        int govconsaltionsf=-999999999;
        int govermentcostf=-999999999;//income and cost for france for goverment entities
        int govermentincomef=-999999999;
        int govconsaltionsb=-999999999;
        int govermentcostb=-999999999;//income and cost for belgium for goverment entities
        int govermentincomeb=-999999999;
        int govconsaltionsg=-999999999;
        int govermentcostg=-999999999;//income and cost for germany for goverment entities
        int govermentincomeg=-999999999;
        while (exit==false){
            Scanner sc= new Scanner(System.in);
            System.out.println("1. Enter costs and income for France");
            System.out.println("2. Enter costs and income for Belgium");
            System.out.println("3. Enter costs and income for Germany");
            System.out.println("4. Calculate Statistics");
            System.out.println("5. View Summary");
            System.out.println("6. Exit");
            int dession=sc.nextInt();
            if (dession==1){
                System.out.println(text(dession));
                consaltionsf=sc.nextInt();
                negativechecker(consaltionsf);
                costf=sc.nextInt();
                negativechecker(costf);
                incomef=sc.nextInt();
                negativechecker(incomef);
                govconsaltionsf=sc.nextInt();
                negativechecker(govconsaltionsf);
                govermentcostf=sc.nextInt();
                negativechecker(govermentcostf);
                govermentincomef=sc.nextInt();
                negativechecker(govermentincomef);
            }
            if (dession==2){
                System.out.println(text(dession));
                consaltionsb=sc.nextInt();
                negativechecker(consaltionsb);
                costb=sc.nextInt();
                negativechecker(costb);
                incomeb=sc.nextInt();
                negativechecker(incomeb);
                govconsaltionsb=sc.nextInt();
                negativechecker(govconsaltionsb);
                govermentcostb=sc.nextInt();
                negativechecker(govermentcostb);
                govermentincomeb=sc.nextInt();
                negativechecker(govermentincomeb);
                
            }
            if (dession==3){
                System.out.println(text(dession));
                consaltionsg=sc.nextInt();
                negativechecker(consaltionsg);
                costg=sc.nextInt();
                negativechecker(costg);
                incomeg=sc.nextInt();
                negativechecker(incomeg);
                govconsaltionsg=sc.nextInt();
                negativechecker(govconsaltionsg);
                govermentcostg=sc.nextInt();
                negativechecker(govermentcostg);
                govermentincomeg=sc.nextInt();
                negativechecker(govermentincomeg);
            }
            if (dession==4){
                System.out.println("---------------------------------------------------------------------------------------------");

                int govfprofit=govermentincomef-govermentcostf;//goverment  profit in france
                int govbprofit=govermentincomeb-govermentcostb;
                int govgprofit=govermentincomeg-govermentcostg;
                int pubfprofit=incomef-costf;//public profit in france 
                int pubbprofit=incomeb-costb;
                int pubgprofit=incomeg-costg;
                int fprofit=(incomef+govermentincomef)-(govermentcostf+costf);//genral profit
                int bprofit=(incomeb+govermentincomeb)-(govermentcostb+costb);
                int gprofit=(incomeg+govermentincomeg)-(govermentcostg+costg);
                System.out.println("1. Total profit for both types of consultation for each country :" );
                System.out.println("france : "+fprofit);
                System.out.println("bulgium : "+bprofit);
                System.out.println("germany : "+gprofit);
                if (govfprofit>govbprofit && govfprofit>govgprofit){
                    System.out.println("2. The most profitable location for government consultation france ");
                }
                if (govbprofit>govfprofit && govbprofit>govgprofit){
                    System.out.println("2. The most profitable location for government consultation bulgium");
                }
                if (govgprofit>govfprofit && govgprofit>govbprofit){
                    System.out.println("2. The most profitable location for government consultation germany ");
                }
                if (pubfprofit>pubbprofit && pubfprofit>pubgprofit){
                    System.out.println("3. The most profitable location for public consultation france ");
                }
                if (pubbprofit>pubfprofit && pubbprofit>pubgprofit){
                    System.out.println("3. The most profitable location for public consultation bulgium");
                }
                if (pubgprofit>pubfprofit && pubgprofit>pubbprofit){
                    System.out.println("3. The most profitable location for public consultation germany ");
                
                
                }
                System.out.println("Total number of consultations carried out : "+(consaltionsf+consaltionsb+consaltionsg+govconsaltionsf+govconsaltionsb+govconsaltionsg));
                System.out.println("---------------------------------------------------------------------------------------------");

            }
            if (dession==5){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println(Summary(consaltionsf,consaltionsb,consaltionsg,costf,costb,costg,incomef,incomeb,incomeg,"public"));
                System.out.println(Summary(govconsaltionsf,govconsaltionsb,govconsaltionsg,govermentcostf,govermentcostb,govermentcostg,govermentincomef,govermentincomeb,govermentincomeg,"goverment"));
                System.out.println("---------------------------------------------------------------------------------------------");

            }
            if (dession==6){
                exit=true;
            }



        }
        
    }
    public static String text(int  a){// this method is used to decrease the amount of lines used 
        String country="";//intialization
        if (a==1){
         country="france";
       }
       if (a==2){
        country="belgium";
       }
       if (a==3){
        country="germany";
       }
       String line1="please input the amount of genral public consultauions in "+country;
       String line2="please input the genral public COSTS in "+country;
       String line3="please input the genral public income in "+country;
       String line4="please input the amount of  goverment entities consultauions in "+country;
       String line5="please input the  goverment entities COSTS in "+country;
       String line6="please input the  goverment entities income in"+country;
       String line7="in order please";
       String result = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7;//THIS IS TO PUT THE UNDER EACH OTHER
       return result;

    }
    public static String Summary(int a,int b,int c ,int d,int e,int f,int g,int h,int i,String j){//sorry i know the letters are really confusingreally confusing personally i got mixed up with the letters many times but when you follow them you will understand
        String format = "%-35s%-25s%-25s%-25s"; // i could'nt find a way to alagin the tables so i had to look through the internet and i found a way called format which helps in indentation because the user might input a big number and spoil the table 
        String line1 = String.format("%-35s%-25s%-25s%-25s", j+" Consultation", "France", "Belgium", "Germany");// 30,20,20and are the spaces used between column in each the following lines
        String line2 = String.format(format, "Total Consultation", a, b, c);
        String line3 = String.format(format, "Total Costs incurred (€)", d, e, f);
        String line4 = String.format(format, "Total Income derived (€)", g, h, i);
        String line5 = String.format(format, "Profit / Loss in current year (€)", (g - d), (h - e), (i - f));
        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5;

    }
    public static void negativechecker(int a){
        Scanner sc= new Scanner(System.in);
        while(a<0){
            System.out.println("plrease input positibve number");
            a=sc.nextInt();

        }
    }
}