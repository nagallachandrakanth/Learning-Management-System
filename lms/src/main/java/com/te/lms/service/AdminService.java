package com.te.lms.service;

import java.util.List;
import java.util.Optional;

import com.te.lms.dto.BatchDto;
import com.te.lms.dto.ChangeStatusDto;
import com.te.lms.dto.MentorDto;
import com.te.lms.dto.MessageDto;
import com.te.lms.dto.ReasonDto;
import com.te.lms.dto.RequestDto;
import com.te.lms.dto.UpdateBatchDto;
import com.te.lms.dto.UpdateMentorDto;
import com.te.lms.entity.Batch;
import com.te.lms.entity.Mentor;
import com.te.lms.entity.Request;
import com.te.lms.response.ApiResponse;

public interface AdminService {

	Optional<Batch> register(BatchDto batchDto);

	Optional<Mentor> mentorRegister(MentorDto mentorDto);

	//Optional<Request> requestRegister(RequestDto requestDto);

	Optional<Boolean> updateMentor(Integer no, UpdateMentorDto updateMentorDto);

	Optional<Boolean> deleteMentor(Integer no);

	Optional<Boolean> deleteBatch(Integer batchId);

	Optional<Boolean> updateBatch(Integer batchId, UpdateBatchDto updateBatchDto);

	Optional<MentorDto> searchMentor(Integer no);

	Optional<BatchDto> searchBatch(Integer batchId);


	Optional<MessageDto> requestapprove(Integer no, ChangeStatusDto changeStatusDto);

	Optional<MessageDto> rejectRequst(Integer employeeId, ReasonDto reasonDto);

	Optional<List<BatchDto>> batchlist();

	Optional<List<MentorDto>> mentorList();

	Optional<List<RequestDto>> requestList();

}