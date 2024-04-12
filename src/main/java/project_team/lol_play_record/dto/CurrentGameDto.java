package project_team.lol_play_record.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CurrentGameDto {
    //게임 정보
    //puuid로 매칭중인 게임 정보 가져오기
    public Long gameId;
    public List<ParticipantDto> participants;
    public String gameMode;
    public String gameType;
    public Long mapId;
    public Long gameQueueConfigId;
    public Map<String, String> observers;
    public String platformId;
    public List bannedChampions;
    public Long gameStartTime;
    public Long gameLength;

    @Data
    public static class ParticipantDto {
        //puuid로 매칭중인 게임 정보 가져오기
        public boolean bot;
        public long championId;
        public String chapionUrl;
        public long teamId;
        public long spell1Id;
        public long spell2Id;
        public String spell1Url;
        public String spell2Url;
        public long profileIconId;
        public String summonerName;
        public String summonerId;
        public String puuid;
    }

}
