import java.util.Random;

enum Answers {
    NO,YES,MAYBE,LATER,SOON,NEVER;
}
class Question {
    Random rand = new Random();

    Answers ask() {
        int prob = (int )(100*rand.nextInt());
        if (prob < 15)
            return Answers.MAYBE;
        if (prob < 30)
            return Answers.NO;
        if (prob < 60)
            return Answers.YES;
        if (prob < 75)
            return Answers.LATER;
        if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }
}
class AskMe {
    static void answer (Answers result) {
        switch(result){
            case YES:
                System.out.println("ДА");
                break;
            case NO:
                System.out.println("НЕТ");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;

        }
    }
}

public class Questions
{ public static void main (String args[]){
    Question q = new Question();

    AskMe.answer(q.ask());
    AskMe.answer(q.ask());
    AskMe.answer(q.ask());
    AskMe.answer(q.ask());
    AskMe.answer(q.ask());


}
}
