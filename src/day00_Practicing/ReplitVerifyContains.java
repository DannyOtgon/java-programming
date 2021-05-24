package day00_Practicing;

import day41_arraylist.ArraysAsList;

import java.util.*;

public class ReplitVerifyContains {
    public static void main(String[] args) {


        Nba player = new Nba();
        player.name = "Kobe";
        player.nums = 8;
        System.out.println(player.name + player.nums);





    }
    public static class Nba{
        private String name;
        private Integer nums;

        public void setName(String name) {
            this.name = name;
        }

        public void setNums(Integer nums) {
            this.nums = nums;
        }

        public String getName() {
            return name;
        }

        public Integer getNums() {
            return nums;
        }
    }
    }

