package com.eugenestudio.EugeneWechatServer.model;

public class SportsMatch {
    private Integer count;

    private String leagueName;

    private String hostTeamName;

    private String guestTeamName;

    private String matchTime;

    private String initialWinOdds;

    private String initialDrawOdds;

    private String initialLoseOdds;

    private String currentWinOdds;

    private String currentDrawOdds;

    private String currentLoseOdds;

    private String initialWinScatter;

    private String initialDrawScatter;

    private String initialLoseScatter;

    private String currentWinScatter;

    private String currentDrawScatter;

    private String currentLoseScatter;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName == null ? null : leagueName.trim();
    }

    public String getHostTeamName() {
        return hostTeamName;
    }

    public void setHostTeamName(String hostTeamName) {
        this.hostTeamName = hostTeamName == null ? null : hostTeamName.trim();
    }

    public String getGuestTeamName() {
        return guestTeamName;
    }

    public void setGuestTeamName(String guestTeamName) {
        this.guestTeamName = guestTeamName == null ? null : guestTeamName.trim();
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime == null ? null : matchTime.trim();
    }

    public String getInitialWinOdds() {
        return initialWinOdds;
    }

    public void setInitialWinOdds(String initialWinOdds) {
        this.initialWinOdds = initialWinOdds == null ? null : initialWinOdds.trim();
    }

    public String getInitialDrawOdds() {
        return initialDrawOdds;
    }

    public void setInitialDrawOdds(String initialDrawOdds) {
        this.initialDrawOdds = initialDrawOdds == null ? null : initialDrawOdds.trim();
    }

    public String getInitialLoseOdds() {
        return initialLoseOdds;
    }

    public void setInitialLoseOdds(String initialLoseOdds) {
        this.initialLoseOdds = initialLoseOdds == null ? null : initialLoseOdds.trim();
    }

    public String getCurrentWinOdds() {
        return currentWinOdds;
    }

    public void setCurrentWinOdds(String currentWinOdds) {
        this.currentWinOdds = currentWinOdds == null ? null : currentWinOdds.trim();
    }

    public String getCurrentDrawOdds() {
        return currentDrawOdds;
    }

    public void setCurrentDrawOdds(String currentDrawOdds) {
        this.currentDrawOdds = currentDrawOdds == null ? null : currentDrawOdds.trim();
    }

    public String getCurrentLoseOdds() {
        return currentLoseOdds;
    }

    public void setCurrentLoseOdds(String currentLoseOdds) {
        this.currentLoseOdds = currentLoseOdds == null ? null : currentLoseOdds.trim();
    }

    public String getInitialWinScatter() {
        return initialWinScatter;
    }

    public void setInitialWinScatter(String initialWinScatter) {
        this.initialWinScatter = initialWinScatter == null ? null : initialWinScatter.trim();
    }

    public String getInitialDrawScatter() {
        return initialDrawScatter;
    }

    public void setInitialDrawScatter(String initialDrawScatter) {
        this.initialDrawScatter = initialDrawScatter == null ? null : initialDrawScatter.trim();
    }

    public String getInitialLoseScatter() {
        return initialLoseScatter;
    }

    public void setInitialLoseScatter(String initialLoseScatter) {
        this.initialLoseScatter = initialLoseScatter == null ? null : initialLoseScatter.trim();
    }

    public String getCurrentWinScatter() {
        return currentWinScatter;
    }

    public void setCurrentWinScatter(String currentWinScatter) {
        this.currentWinScatter = currentWinScatter == null ? null : currentWinScatter.trim();
    }

    public String getCurrentDrawScatter() {
        return currentDrawScatter;
    }

    public void setCurrentDrawScatter(String currentDrawScatter) {
        this.currentDrawScatter = currentDrawScatter == null ? null : currentDrawScatter.trim();
    }

    public String getCurrentLoseScatter() {
        return currentLoseScatter;
    }

    public void setCurrentLoseScatter(String currentLoseScatter) {
        this.currentLoseScatter = currentLoseScatter == null ? null : currentLoseScatter.trim();
    }
}