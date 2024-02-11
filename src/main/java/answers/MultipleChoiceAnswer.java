package answers;

public class MultipleChoiceAnswer extends QuestionnaireAnswer {

    private final int[] answers;

    public MultipleChoiceAnswer(int[] answers) {
        this.answers = answers;
    }

    public int[] getAnswers() {
        return answers;
    }

}
