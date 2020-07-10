final LineMessagingClient client = LineMessagingClient
        .builder("q1xhpvaFzep0p1TpC+wB3gtF6sUR7usGff0LwCTGgrYnnoWUaHRVQR9IOxvV49yZPCdEJCM8zXRff+qL4ZS+d/3buHnosVFJ0qXVLhEe6VV79URz2rf0G6al0HxBnC/O6QIDb3QThJTK+5/96Hgh6QdB04t89/1O/w1cDnyilFU=")
        .build();

final TextMessage textMessage = new TextMessage("hello");
final ReplyMessage replyMessage = new ReplyMessage(
        "<replyToken>",
        textMessage);

final BotApiResponse botApiResponse;
try {
    botApiResponse = client.replyMessage(replyMessage).get();
} catch (InterruptedException | ExecutionException e) {
    e.printStackTrace();
    return;
}

System.out.println(botApiResponse);