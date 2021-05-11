package utils.operacao;

import utils.operacao.internal.DivHelper;
import utils.operacao.internal.MultiHelper;
import utils.operacao.internal.SubHelper;
import utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultiHelper multiHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper =  new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }
    public int mult(int a , int b){
        return multiHelper.execute(a, b);
    }
    public int div(int a , int b){
        return divHelper.execute(a, b);
    }
}
