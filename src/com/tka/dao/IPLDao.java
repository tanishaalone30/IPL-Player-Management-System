package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.IPLPlayer;


public class IPLDao {


	public List<IPLPlayer> getAllPlayers() {

			List<IPLPlayer> allplayers = new ArrayList<>();

			// MI

			allplayers.add(new IPLPlayer(1,45,"Rohit Sharma",520,0,"MI","Batter"));
			allplayers.add(new IPLPlayer(2,63,"Suryakumar Yadav",610,0,"MI","Batter"));
			allplayers.add(new IPLPlayer(3,77,"Tilak Varma",430,0,"MI","Batter"));
			allplayers.add(new IPLPlayer(4,19,"Hardik Pandya",320,12,"MI","AllRounder"));
			allplayers.add(new IPLPlayer(5,33,"Tim David",280,3,"MI","AllRounder"));
			allplayers.add(new IPLPlayer(6,99,"Ishan Kishan",450,0,"MI","Batter"));
			allplayers.add(new IPLPlayer(7,7,"Jasprit Bumrah",25,24,"MI","Bowler"));
			allplayers.add(new IPLPlayer(8,24,"Gerald Coetzee",35,18,"MI","Bowler"));
			allplayers.add(new IPLPlayer(9,55,"Piyush Chawla",40,15,"MI","Bowler"));
			allplayers.add(new IPLPlayer(10,14,"Akash Madhwal",15,11,"MI","Bowler"));
			allplayers.add(new IPLPlayer(11,18,"Luke Wood",10,9,"MI","Bowler"));

			// CSK

			allplayers.add(new IPLPlayer(12,7,"MS Dhoni",220,0,"CSK","Batter"));
			allplayers.add(new IPLPlayer(13,31,"Ruturaj Gaikwad",650,0,"CSK","Batter"));
			allplayers.add(new IPLPlayer(14,8,"Ravindra Jadeja",340,16,"CSK","AllRounder"));
			allplayers.add(new IPLPlayer(15,25,"Shivam Dube",510,0,"CSK","Batter"));
			allplayers.add(new IPLPlayer(16,81,"Moeen Ali",300,10,"CSK","AllRounder"));
			allplayers.add(new IPLPlayer(17,47,"Daryl Mitchell",280,5,"CSK","AllRounder"));
			allplayers.add(new IPLPlayer(18,90,"Deepak Chahar",40,14,"CSK","Bowler"));
			allplayers.add(new IPLPlayer(19,54,"Tushar Deshpande",15,18,"CSK","Bowler"));
			allplayers.add(new IPLPlayer(20,27,"Matheesha Pathirana",10,22,"CSK","Bowler"));
			allplayers.add(new IPLPlayer(21,99,"Mustafizur Rahman",5,17,"CSK","Bowler"));
			allplayers.add(new IPLPlayer(22,10,"Mukesh Choudhary",8,12,"CSK","Bowler"));

			// RCB

			allplayers.add(new IPLPlayer(23,18,"Virat Kohli",741,0,"RCB","Batter"));
			allplayers.add(new IPLPlayer(24,97,"Faf du Plessis",438,0,"RCB","Batter"));
			allplayers.add(new IPLPlayer(25,19,"Rajat Patidar",395,0,"RCB","Batter"));
			allplayers.add(new IPLPlayer(26,32,"Glenn Maxwell",210,6,"RCB","AllRounder"));
			allplayers.add(new IPLPlayer(27,21,"Cameron Green",315,10,"RCB","AllRounder"));
			allplayers.add(new IPLPlayer(28,17,"Dinesh Karthik",326,0,"RCB","Batter"));
			allplayers.add(new IPLPlayer(29,73,"Mohammed Siraj",45,15,"RCB","Bowler"));
			allplayers.add(new IPLPlayer(30,8,"Yash Dayal",20,14,"RCB","Bowler"));
			allplayers.add(new IPLPlayer(31,56,"Lockie Ferguson",12,11,"RCB","Bowler"));
			allplayers.add(new IPLPlayer(32,44,"Karn Sharma",25,10,"RCB","Bowler"));
			allplayers.add(new IPLPlayer(33,99,"Alzarri Joseph",18,9,"RCB","Bowler"));

			// SRH

			allplayers.add(new IPLPlayer(34,87,"Travis Head",680,0,"SRH","Batter"));
			allplayers.add(new IPLPlayer(35,8,"Abhishek Sharma",540,8,"SRH","AllRounder"));
			allplayers.add(new IPLPlayer(36,18,"Aiden Markram",410,0,"SRH","Batter"));
			allplayers.add(new IPLPlayer(37,69,"Heinrich Klaasen",620,0,"SRH","Batter"));
			allplayers.add(new IPLPlayer(38,47,"Nitish Kumar Reddy",450,6,"SRH","AllRounder"));
			allplayers.add(new IPLPlayer(39,24,"Shahbaz Ahmed",220,9,"SRH","AllRounder"));
			allplayers.add(new IPLPlayer(40,4,"Pat Cummins",140,18,"SRH","Bowler"));
			allplayers.add(new IPLPlayer(41,44,"Bhuvneshwar Kumar",35,17,"SRH","Bowler"));
			allplayers.add(new IPLPlayer(42,99,"T Natarajan",20,22,"SRH","Bowler"));
			allplayers.add(new IPLPlayer(43,17,"Mayank Markande",15,13,"SRH","Bowler"));
			allplayers.add(new IPLPlayer(44,55,"Jaydev Unadkat",10,12,"SRH","Bowler"));

			return allplayers;
		}

		public List<IPLPlayer> getPlayersByTeam(String team) {

			List<IPLPlayer> result = new ArrayList<>();

			for(IPLPlayer p : getAllPlayers()) {
				if(p.getTname().equalsIgnoreCase(team)) {
					result.add(p);
				}
			}

			return result;
		}

		public List<IPLPlayer> getBatters() {

			List<IPLPlayer> result = new ArrayList<>();

			for(IPLPlayer p : getAllPlayers()) {
				if(p.getRole().equalsIgnoreCase("Batter")) {
					result.add(p);
				}
			}

			return result;
		}

		public List<IPLPlayer> getBowlers() {

			List<IPLPlayer> result = new ArrayList<>();

			for(IPLPlayer p : getAllPlayers()) {
				if(p.getRole().equalsIgnoreCase("Bowler")) {
					result.add(p);
				}
			}

			return result;
		}

		public List<IPLPlayer> getAllRounders() {

			List<IPLPlayer> result = new ArrayList<>();

			for(IPLPlayer p : getAllPlayers()) {
				if(p.getRole().equalsIgnoreCase("AllRounder")) {
					result.add(p);
				}
			}

			return result;
		}
	}	
