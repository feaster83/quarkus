package io.quarkus.axon.deployment.aggregatetest;

import io.quarkus.arc.Unremovable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

// @Unremovable is needed otherwise build processor will drop it because it's not injected
// by @Inject or @Provider
@Unremovable
@ApplicationScoped
public class TestService {

    @Inject
    TestRepository testRepository;

    public void doSomethingToTestDIInjection() {
        testRepository.save();
    }
}
