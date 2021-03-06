package lv.ctco.cukesrest.api;

import com.google.inject.*;
import cucumber.api.java.en.*;
import lv.ctco.cukesrest.internal.*;
import lv.ctco.cukesrest.internal.helpers.*;

@Singleton
public class AwaitSteps {

    @Inject
    RequestSpecificationFacade facade;

    @Given("^should wait at most (\\d+) ([^ ]+) with interval (\\d+) ([^ ]+) until status code (\\d+)$")
    public void should_wait_at_most_until_status_code_with_interval
        (int atMostTime, String atMostUnit,
         int intervalTime, String intervalUnit,
         int statusCode) {
        facade.shouldWaitWithIntervalUntilStatusCodeReceived(
            Time.of(atMostTime, atMostUnit),
            Time.of(intervalTime, intervalUnit),
            statusCode);
    }

    @Given("^should wait at most (\\d+) ([^ ]+) with interval (\\d+) ([^ ]+) until status code (\\d+) or fail with \"([^\"]+)\"$")
    public void should_wait_at_most_until_status_code_with_interval_or_fail_with
        (int atMostTime, String atMostUnit,
         int intervalTime, String intervalUnit,
         int statusCode, int failStatusCode) {
        facade.shouldWaitWithIntervalUntilStatusCodeReceived(
            Time.of(atMostTime, atMostUnit),
            Time.of(intervalTime, intervalUnit),
            statusCode, failStatusCode);
    }

    @Given("^should wait at most (\\d+) ([^ ]+) with interval (\\d+) ([^ ]+) until property \"([^\"]+)\" equal to \"([^\"]+)\"$")
    public void should_wait_at_most_until_property_equals_with_interval
        (int atMostTime, String atMostUnit,
         int intervalTime, String intervalUnit,
         String property, String value) {
        facade.shouldWaitWithIntervalUntilPropertyEqualToValue(
            Time.of(atMostTime, atMostUnit),
            Time.of(intervalTime, intervalUnit),
            property, value);
    }

    @Given("^should wait at most (\\d+) ([^ ]+) with interval (\\d+) ([^ ]+) until property \"([^\"]+)\" equal to \"([^\"]+)\" or fail with \"([^\"]+)\"$")
    public void should_wait_at_most_until_property_equals_with_interval_or_fail_with
        (int atMostTime, String atMostUnit,
         int intervalTime, String intervalUnit,
         String property, String value, String failValue) {
        facade.shouldWaitWithIntervalUntilPropertyEqualToValue(
            Time.of(atMostTime, atMostUnit),
            Time.of(intervalTime, intervalUnit),
            property, value, failValue);
    }

    @Given("^should wait at most (\\d+) ([^ ]+) with interval (\\d+) ([^ ]+) until header \"([^\"]+)\" equal to \"([^\"]+)\"$")
    public void should_wait_at_most_until_header_equals_with_interval
        (int atMostTime, String atMostUnit,
         int intervalTime, String intervalUnit,
         String property, String value) {
        facade.shouldWaitWithIntervalUntilHeaderEqualToValue(
            Time.of(atMostTime, atMostUnit),
            Time.of(intervalTime, intervalUnit),
            property, value);
    }

    @Given("^should wait at most (\\d+) ([^ ]+) with interval (\\d+) ([^ ]+) until header \"([^\"]+)\" equal to \"([^\"]+)\" or fail with \"([^\"]+)\"$")
    public void should_wait_at_most_until_header_equals_with_interval_or_fail_with
        (int atMostTime, String atMostUnit,
         int intervalTime, String intervalUnit,
         String property, String value, String failValue) {
        facade.shouldWaitWithIntervalUntilHeaderEqualToValue(
            Time.of(atMostTime, atMostUnit),
            Time.of(intervalTime, intervalUnit),
            property, value, failValue);
    }
}
