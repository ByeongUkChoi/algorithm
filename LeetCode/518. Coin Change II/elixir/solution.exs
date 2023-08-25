defmodule Solution do
  @spec change(amount :: integer, coins :: [integer]) :: integer
  def change(amount, coins) do
    Enum.reduce(coins, %{0 => 1}, fn coin, acc_dp ->
      dp(amount, coin, acc_dp)
    end)[amount]
  end

  def dp(amount, coin, dp) do
    Enum.reduce(1..amount, dp, fn val, acc_dp ->
      prev_dp = Map.get(acc_dp, val, 0)
      without_current_coin_dp = Map.get(acc_dp, val - coin, 0)
      Map.put(acc_dp, val, prev_dp + without_current_coin_dp)
    end)
  end
end
