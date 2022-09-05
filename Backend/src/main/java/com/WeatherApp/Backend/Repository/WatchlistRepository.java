package com.WeatherApp.Backend.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WeatherApp.Backend.entity.watchlist;
public interface WatchlistRepository  extends JpaRepository <watchlist, Long> {
	
		  
		  List<watchlist> findBycity(String city);
		}

