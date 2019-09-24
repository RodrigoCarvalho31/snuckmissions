package net.snuckdev.snuckmissions.enums;

public enum MissionType {
    BREAK_BLOCKS("broken_blocks_level"),
    PLACE_BLOCKS("placed_blocks_level"),
    PLAYER_KILL("players_killed_level"),
    MOB_KILL("mobs_killed_level");
    
    private String path;
    
    MissionType(String path) {
        this.path = path;
    }
    
    pubic String getPath() {
        return path;
    }
}
