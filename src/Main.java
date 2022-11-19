import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("здраствуйти на пиксоф ");
                System.out.print("зделайти регистратсию:"+"\n");
                System.out.println("видите имя  и фамилия: ");
                regs regs=new regs("arun","janysbekov",16);
                System.out.println(regs.toString());
                System.out.println("вы зделали регестратсию на пиксофт на айти вы можети учится " +
                        "плата на учобу 12000");
                System.out.println("вы согласны: ");
                String s1=scanner.nextLine();
                switch (s1){
                    case "да":
                        System.out.println(s1);
                        break;
                    case "нет":
                        System.out.println("хорошо спосиба за информатисию дасвидвния");
                        break;
                    default:
                        System.out.println("???");
                        System.out.println("да или нет");
                }
                System.out.println("добро пожалывать вы прошли регестрадцию" +
                        "вы берите на кава будите учится" +
                        "эсть java и javackrip");
                String s=scanner.nextLine();
                switch (s){
                    case "java":
                        System.out.println("вы курсник java9");
                        break;
                    case "javackrip":
                        System.out.println("вы курсник javackrip");
                        break;
                }
            }
        }