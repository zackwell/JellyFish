package Design3;
public class OperationFactory {
    public static Operation creatOperation(String operate){
        Operation oper = null;
//        if ("+".equals(operate)) {
//            oper = new OperationAdd();
//        }
//       if ("-".equals(operate)) {
//            oper = new OperationSub();
//        }
//        if ("*".equals(operate)) {
//            oper = new OperationMul();
//        }
//        if ("/".equals(operate)) {
//            oper = new OperationDiv();
//        }
        if ("+".equals(operate)) {

            oper = new OperationAdd();
        }else if("-".equals(operate)){

            oper = new OperationSub();
        }
        else if("*".equals(operate)){
            oper = new OperationMul();
        }
        else if("/".equals(operate)){
            oper = new OperationDiv();
        }

        return  oper;
    }
}

