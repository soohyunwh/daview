package com.daview.service;

import java.util.List;

import com.daview.dto.ReservationDTO;

public interface ReservationService {
	int insertReservation(ReservationDTO reservation);

	List<ReservationDTO> selectReservationById(int memberId);

	int deleteReservation(String rsvId);

	int deleteAllReservation();
}
