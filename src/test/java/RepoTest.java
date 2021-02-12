import model.Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import patterns.chain_of_resp.AbstractMessageHandler;
import patterns.command.SaveClass;
import patterns.command.SaveCourseModule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Demonstrates use of Chain of Responsibility pattern.
 *
 * @author CESAR
 */
@DisplayName("Testing - Repo package")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RepoTest {
    @Test
    @DisplayName("test saveCourse")
    void saveCourse() {
        SaveCourseModule saveCourseModule = mock(SaveCourseModule.class);
        saveCourseModule.save();
        verify(saveCourseModule,times(1)).save();
    }
    @Test
    @DisplayName("test saveClass")
    void saveClass() {
        SaveClass saveClass = mock(SaveClass.class);
        saveClass.save();
        verify(saveClass,times(1)).save();
    }

}
