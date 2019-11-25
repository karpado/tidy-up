package com.kodekonveyor.work_request.find;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.kodekonveyor.authentication.UserTestData;
import com.kodekonveyor.work_request.AddressTestData;
import com.kodekonveyor.work_request.WorkRequestEntityRepositoryStubs;
import com.kodekonveyor.work_request.WorkRequestRepository;
import com.kodekonveyor.work_request.WorkRequestTestData;

public class FindWorkRequestControllerTestBase {
	@InjectMocks
	protected FindWorkRequestController findWorkRequestController;
	@Mock
	protected WorkRequestRepository workRequestRepository;
	protected AddressTestData addressTestData;
	protected UserTestData userTestData;
	protected WorkRequestTestData workRequestTestData;

	@BeforeEach
	protected void setUp() {
		addressTestData = new AddressTestData();
		userTestData = new UserTestData();
		workRequestTestData = new WorkRequestTestData(userTestData,
				addressTestData);

		WorkRequestEntityRepositoryStubs.behaviour(workRequestRepository,
				workRequestTestData, addressTestData);
	}
}
