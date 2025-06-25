/*
    This file is part of the HeavenMS MapleStory Server, commands OdinMS-based
    Copyleft (L) 2016 - 2019 RonanLana

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/*
   @Author: Arthur L - Refactored command content into modules
*/
package client.command.commands.gm0;

import client.Client;
import client.command.Command;
import tools.PacketCreator;
import tools.Randomizer;

public class RollCommand extends Command {
    {
        setDescription("Roll numbers");
    }

    @Override
    public void execute(Client c, String[] params) {
        client.Character player = c.getPlayer();
        int min = 1, max = 100;
        int rand = Randomizer.nextInt(max - min + 1) + min;
        String str = player.getName() + " rolled a " + rand + " out of 100!";
        player.getMap().broadcastMessage(PacketCreator.serverNotice(5, str));
    }
}
