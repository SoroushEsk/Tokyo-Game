package com.tui.command.regex;

public class CommandRegex {
    // user create -u <username> -p <password> <password confirmation> –email <email> -n <nickname>
    private final String createUserRegex            =       "user\\s+create\\s+-u\\s+(.+)\\s+-p\\s+(.+)\\s+\\s+(.+)\\s+–email\\s+(.+)\\s+-n\\s+(.+)\\s+$";
}
