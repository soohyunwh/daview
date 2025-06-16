package com.daview.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daview.dto.ReservationDTO;

@Mapper
public interface ReservationMapper {
	int insertReservation(ReservationDTO reservation);

	List<ReservationDTO> selectReservationById(int memberId);

	int deleteReservation(String rsvId);

	int deleteAllReservation();
}
