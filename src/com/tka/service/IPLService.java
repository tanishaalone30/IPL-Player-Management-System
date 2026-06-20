package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.IPLPlayer;

public class IPLService {

		private IPLDao iplrepo = new IPLDao();

		public List<IPLPlayer> getAllPlayers() {
			return iplrepo.getAllPlayers();
		}

		public List<IPLPlayer> getPlayersByTeam(String team) {
			return iplrepo.getPlayersByTeam(team);
		}

		public List<IPLPlayer> getBatters() {
			return iplrepo.getBatters();
		}

		public List<IPLPlayer> getBowlers() {
			return iplrepo.getBowlers();
		}

		public List<IPLPlayer> getAllRounders() {
			return iplrepo.getAllRounders();
		}
	}

