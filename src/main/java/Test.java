import javaslang.collection.List;

/**
 * Created by wallace on 10/05/17.
 */
public class Test {

    public static void main(String[] args){
        Stm p = new CompoundStm(
            new AssignStm(
                    "a",
                    new OpExp(new NumExp(5), new NumExp(3), OpExp.Op.PLUS)
            ),
            new CompoundStm(
                    new AssignStm(
                        "b",
                        new EseqExp(
                                new PrintStm(List.of(
                                        new IdExp("a"),
                                        new OpExp(new IdExp("a"), new NumExp(1), OpExp.Op.MINUS)
                                )),
                                new OpExp(new NumExp(10), new IdExp("a"), OpExp.Op.TIMES)
                        )
                    ),
                    new PrintStm(List.of(new IdExp("b")))
            )
        );

        System.out.println(p);
    }
}
