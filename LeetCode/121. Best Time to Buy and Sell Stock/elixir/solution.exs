defmodule Solution do
  @spec max_profit(prices :: [integer]) :: integer
  def max_profit([h | t]) do
    t
    |> Enum.reduce({h, h, 0}, fn price, {buy, sell, max_prfit} ->
      cond do
        price < buy -> {price, price, max_prfit}
        price > sell -> {buy, price, max(price - buy, max_prfit)}
        true -> {buy, sell, max_prfit}
      end
    end)
    |> then(fn {_buy, _sell, max_prfit} -> max_prfit end)
  end
end
