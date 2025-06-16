package com.daview.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daview.dto.ReservationDTO;
import com.daview.mapper.ReservationMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

	private final ReservationMapper reservationMapper;

	@Override
	public int insertReservation(ReservationDTO reservation) {
		return reservationMapper.insertReservation(reservation);
	}

	@Override
	public List<ReservationDTO> selectReservationById(int memberId) {
		return reservationMapper.selectReservationById(memberId);
	}

	@Override
	public int deleteReservation(String rsvId) {
		return reservationMapper.deleteReservation(rsvId);
	}

	@Override
	public int deleteAllReservation() {
		return reservationMapper.deleteAllReservation();
	}
}
