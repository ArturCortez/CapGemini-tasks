/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ExerciciosJava_CapGemini;


import java.util.*;
import ExerciciosJava_CapGemini.helpers.*;
import java.util.*;
import java.lang.*;
        
        
public class App {
    
    
    public static void exercise1(){
           
         String arg[] = ParametersHelper.PopulateParameters(); 
         System.out.print("resultado da soma: ");
         System.out.println(CalculaTudo.CalculateAll(arg, 1));
    } 

    public static void exercise2(){
        String arg[] = ParametersHelper.PopulateParameters();
        
        System.out.print("Valor da soma: ");
        System.out.println(CalculaTudo.CalculateAll(arg, 1));
        
        System.out.print("Valor da subtracao: ");
        System.out.println(CalculaTudo.CalculateAll(arg, 2));
        
        System.out.print("Valor da multiplicacao: ");
        System.out.println(CalculaTudo.CalculateAll(arg, 3));
        
        System.out.print("Valor da divisao: ");
        System.out.println(CalculaTudo.CalculateAll(arg, 4));
        
        System.out.print("Valor do resto: ");
        System.out.println(CalculaTudo.CalculateAll(arg, 5));
        
    }
    
 
    
    public static void exercise3(){
        String header1 = ("Digite a dist�ncia percorrida: ");
        String header2 = ("Digite o consumo total de combust�vel: ");
        
        String arg[] = ParametersHelper.floatPopulateParameters(header1, header2);
               
        System.out.print("Consumo medio igual a: ");
        System.out.print(CalculaTudo.CalculateAll(arg, 4));
        System.out.print("km/l");
         
    }
    
    public static void exercise4(){
        String answer[] = CalculateSalaryAndComission.CalculateSalaryComission();
        
        System.out.print("Vendedor: "+ answer[0]);
        System.out.print(" ganha " + answer[1] + " de sal�rio fixo");
        System.out.print(" e " + answer[2] + " de salario total");
    }
    
    public static void exercise5(){
        String answer[] = StudentAverageGrade.AverageCalculator();
        System.out.println("Aluno: " + answer[0]);
        
        System.out.println("obteve media: " + answer[1]);
    }
    
    public static void exercise6(){
        String answer[] = ValueSwap.SwapStrVariables();
        System.out.print("Ap�s a troca - Variavel A: " +answer[0]);
        System.out.println(" e Variavel B: " +answer[1]);
    }

    public static void exercise7(){
        System.out.print(CelsiusFahrenheitConverter1.CelsiusToFahrenheit());
    }
    
    public static void Eexercise8(){
        System.out.print("a fazer");
    }
    
    public static void exercise9(){
        System.out.println(InterestRate.InterestRateCalculator(0.7f));
    }
    
    public static void exercise10(){
        
        System.out.println(InterestRate.Parcelation());
    }
   
    public static void exercise11(){
        System.out.println(InterestRate.AddMargin());
    }
    
    public static void exercise12(){
        System.out.println("R$ " +InterestRate.AddMarginAndTaxes());
    }
    
    public static void exercise13(){
        
        System.out.println(numberComparison.underTen());
    }
    public static void exercise14(){
        System.out.println(numberComparison.integerCompare());
    }
    
    public static void exercise15(){
        System.out.println(numberComparison.betweenHundreds());
    }
    
    public static void exercise16(){
        String[] answer = StudentAverageGrade.AverageCalculator();
        
        float finalGrade = Float.parseFloat(answer[1]);
        System.out.println("Nota final " + String.format("%.2f", finalGrade));
        
        if( finalGrade >= 7.0f ){
            
            System.out.println(answer[0] + " Aprovado");
            return;
        } else if (finalGrade < 7.0f && finalGrade >= 5.1f){
            System.out.println(answer[0] + " em Recuperacao");
            return;
        } else if (finalGrade <= 5.0f){
            System.out.println(answer[0] + " Reprovado");
            return;
        }
    }
    
    public static void exercise17(){
        System.out.print("n�meros dentro do interavlo");
        System.out.println(RandomNumberProvider.randomNumberArrayAndFilter(80, 10, 150, 160));
    }
    
    public static void exercise18(){
        for(PessoaClass pessoa: RandomNumberProvider.PeopleListGenerator(300, 18, 50)){
            System.out.println(pessoa.getName() + " " + pessoa.getMaioridade());
        }
        System.out.println();
    }
    
    public static void exercise19(){
        for(PessoaClass pessoa: RandomNumberProvider.PeopleListGenerator(56, 18, 80)){
            System.out.println(pessoa.getName() + " " + pessoa.getGender());
        }
        System.out.println();
    }
    
    public static void exercise20(){
        QuestionarioRecorrente.PerguntaRecorrenteCarro(8,"n");
    }
    
    public static void exercise21(){
        FiltroServicoMilitar.interfaceServicoMilitar();
    }
    
    public static void exercise22(){
        ProdutoClass.manageListProduto();
    }
    
    public static void exercise23(){
        
       int selector = NumberArgumentObject.allEvalNumber(40, 25, 80);
       
       if( selector == 1 ){
            exercise23();
            return;
        }
       
       if(selector == 2) { 
           System.out.println("numero igual a " + 40);
           return;
       }
       if(selector == 3) {
           System.out.println("numero menor que " + 25);
           return;
       }
       if(selector == 4) {
           System.out.println("numero maior que " + 80);
           return;
       }
       
       
       
    }
    
        public static void exercise24(){
            
        int times = NumberArgumentObject.askNumberReturnNumber().intValue();
        System.out.println("Times equals: " + times);
        
        List<Number> numberList = new ArrayList<>();
        
        numberList = NumberArgumentObject.askAnyNumbersReturnNumberList(times, numberList);
        for(Number evalNumber : numberList){
            
            int selector = NumberArgumentObject.allEvalNumberNoAsk(evalNumber, 0, 0, 0);
            
            if( selector == 1 ){
                //exercise24();
                System.out.println("error");
                //return;
            }
       
            if(selector == 2) { 
                System.out.println( evalNumber + " numero igual a " + 0);
                //return;
            }
            if(selector == 3) {
                System.out.println(evalNumber + " numero positivo");
                //return;
            }
            if(selector == 4) {
                System.out.println(evalNumber + " numero negativo" );
                //return;
            }
        }
    }
        
    public static void exercise25(){
        Number firstNumber = NumberArgumentObject.askNumberReturnNumber();
        Number secondNumber = NumberArgumentObject.askNumberReturnNumber();
        String answer = NumberArgumentObject.CompareTwoNumbers(firstNumber, secondNumber);
        
        System.out.println("Comparacao entre: " + firstNumber + " e " + secondNumber);
        System.out.println(answer);
    }
    
    
    public static void exercise26(){
        int digitNumber = NumberArgumentObject.askNumberReturnNumber().intValue();
        String answer = NumberArgumentObject.NumberExtense(digitNumber);
    }
    
    public static void exercise27(){
        
        
        List<CarroClass> carroList = new ArrayList<>();
        
        do{

            String escolhaUsuario = QuestionarioRecorrente.SistemaPerguntaRecorrente("Registrar Novo Carro?");
            if (escolhaUsuario.equalsIgnoreCase("Sim") || escolhaUsuario.equalsIgnoreCase("S")){
                CarroClass carro = new CarroClass();

                String strPrecoCarro = QuestionarioRecorrente.SistemaPerguntaRecorrente("Qual preco do carro novo?");          
                if(strPrecoCarro.equalsIgnoreCase("0")){
                    break;
                }
                carro.setOpcaoName("Carro");
                carro.setPrecoTabela(Float.parseFloat(strPrecoCarro));
                
                String strDescontoPorTipoCombustivel = QuestionarioRecorrente.SistemaPerguntaRecorrente("Qual tipo de Combustivel do carro?");
                carro.setDescontoTipoCombustivel(strDescontoPorTipoCombustivel);

                System.out.println(carro.getOpcaoName() + " - " + carro.getPrecoTabela() + " - " + carro.getDescontoReal());
                carroList.add(carro);
            } else if(escolhaUsuario.equalsIgnoreCase("Nao") || escolhaUsuario.equalsIgnoreCase("N")){
                break;
            }
        
        } while (true);
        
        System.out.println("Printing results:");
        
        
        for(CarroClass carro : carroList){
            System.out.println(carro.getOpcaoName() + " - " + carro.getPrecoTabela() + " - " + carro.getDescontoReal());
            System.out.println("Valor a ser pago pelo cliente: " + (carro.getPrecoTabela() *(1 - carro.getDescontoReal())));
        }
        
    }
    
    public static void exercise28(){
        
        float totalFolhaDePgto = 0;
        for(int i = 0; i < 50; i++){
            float randomSalario = 1000 + RandomNumberProvider.RandomSingleNumberCreator(25000);
            String strSalarioFunc = String.valueOf(randomSalario);

            String strNomeFunc = "Func";

            String newSalario = CalculateSalaryAndComission.CalculateSalaryRaise(strNomeFunc.concat(" - ").concat(String.valueOf(i)), strSalarioFunc, "1000");
            System.out.println(strNomeFunc.concat(" - ").concat(String.valueOf(i)) + " novo salario: R$ " + newSalario);
            totalFolhaDePgto += Float.parseFloat(newSalario);
            
        }
        
        System.out.println(totalFolhaDePgto);
    }
    
    public static void exercise29(){
        List<String> mesList =  new ArrayList<>(Arrays.asList("Mes invalido","Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"));
        String escolhaUsuario = QuestionarioRecorrente.SistemaPerguntaRecorrente("Digite um numero");
        int index = Integer.parseInt(escolhaUsuario);
        try {
            String mesEscolhido = mesList.get(index);
            System.out.println("Mes escolhido: " + mesEscolhido);
            
        } catch(Exception e){
            System.out.println("Mes Invalido");
            String reiniciar = QuestionarioRecorrente.SistemaPerguntaRecorrente("Tentar novamente? (S/N)");
            if(reiniciar.equalsIgnoreCase("n")){
                return;
            } else {
            
                exercise29();
                return;   
            }
   
        }
        
    }
    
    public static void exercise30(){
        int[] arr = SortingAlgorithms.createArray(6);
        int n = arr.length - 1;
        System.out.println("");
        for(int element : arr){            
            System.out.print("Element is: " + element + " "); 
        }
        System.out.println("");
        System.out.println("n is: " + n);
        int [] sortedArr = SortingAlgorithms.QuikSort(arr, 0, n);
        
        System.out.println("sorted Array: ");
        for(int element : sortedArr){         
            System.out.print("Sorted Element is: " + element + " "); 
        }

    }
    
    public static void exercise31(){
        System.out.println(QuestionarioRecorrente.OperacaoMatematicaTresTermos());
        
    }
    
    public static void exercise32(){
        
        try{
            int ladoUm = Integer.parseInt(QuestionarioRecorrente.SistemaPerguntaRecorrente("Digite o valor para o primeiro lado: "));
            int ladoDois = Integer.parseInt(QuestionarioRecorrente.SistemaPerguntaRecorrente("Digite o valor para o segundo lado: "));
            int ladoTres = Integer.parseInt(QuestionarioRecorrente.SistemaPerguntaRecorrente("Digite o valor para o terceiro lado: "));
            TriangleClass triangulo = new TriangleClass(ladoUm, ladoDois, ladoTres);
            System.out.print(triangulo.CheckTrianglePossibility());
            System.out.println("");
            System.out.print("Tipo do Triangulo: ");
            System.out.println(triangulo.DefineTriangleType());
        
        
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void exercise33(){
        
        int nivelProfessor = Integer.parseInt(QuestionarioRecorrente.SistemaPerguntaRecorrente("Qual nivel do Professor? (1, 2 ou 3"));
        int qtdadeHoras = Integer.parseInt(QuestionarioRecorrente.SistemaPerguntaRecorrente("Quantas horas-aulas foram dadas?"));
        ProfessorClass professor = new ProfessorClass();
        professor.setProfessorNivel(nivelProfessor);
        
        int salarioFinal = professor.salarioFinal(qtdadeHoras);
        System.out.println("Salario Final: " + salarioFinal);
    }
    
    public static void exercise34(){
        List<NadadorClass> listNadadores = NadadorClass.CreateRandomListNadadores(8);
        
        
        for(NadadorClass nadador : listNadadores){
            if(nadador.getAge() >= 5 && nadador.getAge() < 7){
                nadador.setNivelCompeticao("Infantil A");
            } else if(nadador.getAge() >= 8 && nadador.getAge() < 10){
                nadador.setNivelCompeticao("Infantil B");
            } else if(nadador.getAge() >= 11 && nadador.getAge() < 13){
                nadador.setNivelCompeticao("Juvenil A");
            } else if(nadador.getAge() >= 14 && nadador.getAge() < 17){
                nadador.setNivelCompeticao("Juvenil B");
            } else if(nadador.getAge() >= 18 && nadador.getAge() < 25){
                nadador.setNivelCompeticao("Senior B");
            }  else {
                nadador.setNivelCompeticao("idade fora da faixa etaria");
            }
            System.out.println(nadador.getName()+ " idade: "+ nadador.getAge() + " - " + nadador.getNivelCompeticao());
        }
    }
    
    public static void exercise35(){
        String tipoResidencia = QuestionarioRecorrente.SistemaPerguntaRecorrente("Qual tipo da residencia?");
        
        float ConsumoMes = Float.parseFloat(QuestionarioRecorrente.SistemaPerguntaRecorrente("Qual consumo no mes?"));
        
        ResidenciaClass imovel = new ResidenciaClass();
        
        imovel.setTipoResidencia(tipoResidencia);
        imovel.setCustoKWh(imovel.getTipoResidencia());
        float answer = imovel.CalculateTotalCost(ConsumoMes);
        System.out.println("Custo de Eletricidade: " + answer);
    }
    
    
    public static void main(String[] args) {

        new App().exercise35();
        
        System.out.println();
        //new App().Calculate();
        //System.out.println(new App().CalculateAll());
    }
}
