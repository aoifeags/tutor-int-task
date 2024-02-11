import answers.MultipleChoiceAnswer;
import answers.SingleChoiceAnswer;
import org.junit.Test;

import static org.junit.Assert.*;

public class TutorQuestionnaireServiceTest {

    @Test
    public void testHandleQuestionnaireDoesReturnCorrectResponseAndScore() throws Exception {
        //given a response body with expected values and expected score

        Request testRequest =
                new Request(
                        "testName",
                        "testId",
                        new MultipleChoiceAnswer(new int[] {0, 3}),
                        new SingleChoiceAnswer(3)
                );
        int expectedScore = 1;

        //when handleQuestionnaire is called

        TutorQuestionnaireService tutorQuestionnaireService = new TutorQuestionnaireService();
        Response actual = tutorQuestionnaireService.handleQuestionnaire(testRequest);


        //then asset that what is returned is a response and a score

        Response expected = new Response(testRequest, expectedScore);


        assertEquals(expected, actual);

    }

    @Test
    public void testHandleQuestionnaireReturnsZeroWhenRequestEmpty() throws Exception {
        //given a response body with expected values and expected score

        Request testRequest =
                new Request(null, null, null, null
                );
        int expectedScore = 0;

        //when handleQuestionnaire is called

        TutorQuestionnaireService tutorQuestionnaireService = new TutorQuestionnaireService();
        Response actual = tutorQuestionnaireService.handleQuestionnaire(testRequest);


        //then asset that what is returned is a response and a score of zero

        Response expected = new Response(testRequest, expectedScore);

        assertEquals(expected, actual);

    }

    @Test
    public void testHandleQuestionnaireDoesReturnCorrectResponseAndScoreMultipleChoiceOnly() throws Exception {
        //given you have a response body you expect
        Request testRequest =
                new Request(
                        "testName",
                        "testId",
                        new MultipleChoiceAnswer(new int[] {0, 1, 2}),
                        null
                );
        int expectedScore = 3;

        //when handleQuestionnaire is called

        TutorQuestionnaireService tutorQuestionnaireService = new TutorQuestionnaireService();
        Response actual = tutorQuestionnaireService.handleQuestionnaire(testRequest);


        //then asset that what is returned is a response and a score

        Response expected = new Response(testRequest, expectedScore);


        assertEquals(expected, actual);

    }

    @Test
    public void testHandleQuestionnaireDoesReturnCorrectResponseAndScoreSingleChoiceOnly() throws Exception {
        Request testRequest =
                new Request(
                        "testName",
                        "testId",
                        null,
                        new SingleChoiceAnswer(3)
                );
        int expectedScore = 0;

        //when handleQuestionnaire is called

        TutorQuestionnaireService tutorQuestionnaireService = new TutorQuestionnaireService();
        Response actual = tutorQuestionnaireService.handleQuestionnaire(testRequest);


        //then asset that what is returned is a response and a score

        Response expected = new Response(testRequest, expectedScore);

        assertEquals(expected, actual);

    }

    // test that the handleQuestionnaire method will throw an exception and log an error message when response body is empty
    @Test
    public void testHandleQuestionnaireThrowsExceptionWhenRequestIsNull(){

        String expectedMessage = "Request body cannot be null.";

        //when handleQuestionnaire is called

        TutorQuestionnaireService tutorQuestionnaireService = new TutorQuestionnaireService();

        //then asset that the code throws an exception because the request body coming in should never be null/

        Throwable thrown = assertThrows(Exception.class, () -> tutorQuestionnaireService.handleQuestionnaire(null));
        assertEquals(expectedMessage, thrown.getMessage());
    }
}
