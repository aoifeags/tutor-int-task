import answers.MultipleChoiceAnswer;
import answers.SingleChoiceAnswer;

import java.util.Objects;

public class Request {
    private final String tutorName;
    private final String tutorId;
    private final MultipleChoiceAnswer multipleChoiceAnswer;
    private final SingleChoiceAnswer singleChoiceAnswer;

    public String getTutorName() {
        return tutorName;
    }

    public String getTutorId() {
        return tutorId;
    }
    public MultipleChoiceAnswer getMultipleChoiceAnswer() {
        return multipleChoiceAnswer;
    }
    public SingleChoiceAnswer getSingleChoiceAnswer() {
        return singleChoiceAnswer;
    }
    public Request(String tutorName, String tutorId, MultipleChoiceAnswer multipleChoiceAnswer, SingleChoiceAnswer singleChoiceAnswer) {
        this.tutorName = tutorName;
        this.tutorId = tutorId;
        this.singleChoiceAnswer = singleChoiceAnswer;
        this.multipleChoiceAnswer = multipleChoiceAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(tutorName, request.tutorName) &&
                Objects.equals(tutorId, request.tutorId) &&
                Objects.equals(multipleChoiceAnswer, request.multipleChoiceAnswer) &&
                Objects.equals(singleChoiceAnswer, request.singleChoiceAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tutorName, tutorId, multipleChoiceAnswer, singleChoiceAnswer);
    }
}